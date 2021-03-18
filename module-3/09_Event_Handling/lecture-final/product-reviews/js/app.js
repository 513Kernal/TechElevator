const name = 'Cigar Parties for Dummies';
let description = 'Host and plan the perfect cigar party for all of your squirrelly friends.';
let reviews = [
  {
    reviewer: 'Malcolm Gladwell',
    title: 'What a book!',
    review:
      "It certainly is a book. I mean, I can see that. Pages kept together with glue (I hope that's glue) and there's writing on it, in some language.",
    rating: 3
  }
];

/**
 * Add our product name to the page title
 * Get our page page title by the id and the query the .name selector
 * once you have the element you can add the product name to the span.
 */
function setPageTitle() {
  const pageTitle = document.getElementById('page-title');
  pageTitle.querySelector('.name').innerHTML = name;
}

/**
 * Add our product description to the page.
 */
function setPageDescription() {
  document.querySelector('.description').innerHTML = description;
}

/**
 * I will display all of the reviews in the reviews array
 */
function displayReviews() {
  if ('content' in document.createElement('template')) {
    reviews.forEach((review) => {
      displayReview(review);
    });
  } else {
    console.error('Your browser does not support templates');
  }
}

/**
 *
 * @param {Object} review The review to display
 */
function displayReview(review) {
  const main = document.getElementById('main');
  const tmpl = document.getElementById('review-template').content.cloneNode(true);
  tmpl.querySelector('h4').innerHTML = review.reviewer;
  tmpl.querySelector('h3').innerHTML = review.title;
  tmpl.querySelector('p').innerHTML = review.review;
  // there will always be 1 star because it is a part of the template
  for (let i = 1; i < review.rating; ++i) {
    const img = tmpl.querySelector('img').cloneNode();
    tmpl.querySelector('.rating').appendChild(img);
  }
  main.appendChild(tmpl);
}

// LECTURE STARTS HERE ---------------------------------------------------------------
document.addEventListener('DOMContentLoaded', () => {

  // set the product reviews page title
  setPageTitle();
  // set the product reviews page description
  setPageDescription();
  // display all of the product reviews on our page
  displayReviews();

  //if the user clicks on the description, call toggleDescriptionEdit
  const desc = document.querySelector('.description');
  desc.addEventListener('click',(event)=>{
    toggleDescriptionEdit(event.target)
  });

  //if the user clicks enter or escape inside the text box, then save if needed
  //either way flip it back to hide the textbox and show the paragraph
  const inputDesc = document.getElementById('inputDesc');
  inputDesc.addEventListener('keyup',(event)=>{
    if (event.key ==='Enter'){
      exitDescriptionEdit(event.target,true);
    }
    if (event.key==='Escape'){
      exitDescriptionEdit(event.target, false);
    }
  });

  //if the user moves the mouse out of the input field, it should do teh same as
  //escape and exit without saving
  inputDesc.addEventListener('mouseleave',(event)=>{
    exitDescriptionEdit(event.target, false);
  });


  //if the user clicks on the button to toggle the form, call showHideForm
  const btnToggleForm = document.getElementById('btnToggleForm');
  btnToggleForm.addEventListener('click',showHideForm);

  //when the user clicks save review, call save reveiw
  const btnSaveReview = document.getElementById('btnSaveReview');
  btnSaveReview.addEventListener('click',(event)=>{
    event.preventDefault();
    saveReview();
  });
})


/**
 * Take an event on the description and swap out the description for a text box.
 *
 * @param {Event} event the event object
 */
function toggleDescriptionEdit(desc) {
  const textBox = desc.nextElementSibling;
  textBox.value = desc.innerText;
  textBox.classList.remove('d-none');
  desc.classList.add('d-none');
  textBox.focus();
}

/**
 * Take an event on the text box and set the description to the contents
 * of the text box and then hide the text box and show the description.
 *
 * @param {Event} event the event object
 * @param {Boolean} save should we save the description text
 */
function exitDescriptionEdit(textBox, save) {
  let desc = textBox.previousElementSibling;
  if (save) {
    desc.innerText = textBox.value;
  }
  textBox.classList.add('d-none');
  desc.classList.remove('d-none');
}

/**
 * I will show / hide the add review form
 */
function showHideForm() {
  const form = document.querySelector('form');
  const btn = document.getElementById('btnToggleForm');

  if (form.classList.contains('d-none')) {
    form.classList.remove('d-none');
    btn.innerText = 'Hide Form';
    document.getElementById('name').focus();
  } else {
    resetFormValues();
    form.classList.add('d-none');
    btn.innerText = 'Add Review';
  }
}

/**
 * I will reset all of the values in the form.
 */
function resetFormValues() {
  const form = document.querySelector('form');
  const inputs = form.querySelectorAll('input');
  inputs.forEach((input) => {
    input.value = '';
  });
  document.getElementById('rating').value = 1;
  document.getElementById('review').value = '';
}

/**
 * I will save the review that was added using the add review from
 */
function saveReview() {
  //create a new review object based on the fields in the form
  const name = document.getElementById('name').value;
  const title = document.getElementById('title').value;
  const rating = document.getElementById('rating').value;
  const review = document.getElementById('review').value;

  const newReview = {
    reviewer: name,
    title: title,
    review: review,
    rating: rating
  }

  //add the new review object to the reviews array
  reviews.push(newReview);

  // call displayReview and pass in the new review as a parameter;
  displayReview(newReview);

  //stop showing the form - showHideForm
  showHideForm();
 }
