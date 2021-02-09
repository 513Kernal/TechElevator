-- SELECT ... FROM
-- Selecting the names for all countries

SELECT name
FROM country;

-- best practice naming convention is all caps
-- name is derived from country - name
-- country was from table-country

-- Selecting the name and population of all countries
SELECT name, population
FROM country;


-- Selecting all columns from the city table
SELECT id, name, countrycode, district, population
FROM city;


-- SELECT ... FROM ... WHERE
-- Selecting the cities in Ohio
SELECT name, district
FROM city
WHERE district = 'Ohio';

SELECT name, district
FROM city
WHERE district ILIKE 'OHIO';
--case insensitive comparison



SELECT name, district
FROM city
WHERE district LIKE 'O%'; --case insensitive comparison
--all the cities in a district that start with O


SELECT name, district
FROM city
WHERE district LIKE '%x%'; -- case sensitive contains the letter x
-- all the cities in a disctrict whose name contains an x


-- Selecting countries that gained independence in the year 1776
SELECT name, indepyear
FROM country
WHERE indepyear = 1776;

-->= greater than
--<= less than
--!= not equal to

SELECT name, indepyear
FROM country
WHERE indepyear = 1776 OR indepyear = 1901;

-- shows multiple years but selective so only if they fall in 1776 or 1901

SELECT name, indepyear
FROM country
WHERE indepyear IN (1776,1901);



SELECT name, indepyear
FROM country
WHERE indepyear BETWEEN 1776 AND 1901;
--Selecting countries that gained independence between 1776 and 1901




-- Selecting countries not in Asia
SELECT name, continent
FROM country
WHERE continent != 'Asia';


-- Selecting countries that do not have an independence year
SELECT name, indepyear
FROM country 
WHERE indepyear IS NULL;
--IS NULL is special character that lists all countries that don't have an indepyear field



-- Selecting countries that do have an independence year
SELECT name, indepyear
FROM country
WHERE indepyear IS NOT NULL;
--IS NOT NULL is special character that returns every country that has an independence year




-- Selecting countries that have a population greater than 5 million
SELECT name, population
FROM country
WHERE population > 5000000;



-- SELECT ... FROM ... WHERE ... AND/OR
-- Selecting cities in Ohio and Population greater than 400,000

SELECT city, district, population
FROM city
WHERE district = 'Ohio' 
  AND population >= 400000;

-- Selecting country names on the continent North America or South America
SELECT name, continent
FROM country
WHERE continent = 'North America'
  OR continent = 'South America';
  
  SELECT name, continent
FROM country
WHERE continent IN ('North America','South America');

SELECT name, continent
FROM country
WHERE continent LIKE '%America';

SELECT name, continent
FROM country
WHERE continent ILIKE '%america';

-- ALL 4 do the same thing and return 51 countries 




-- SELECTING DATA w/arithmetic
-- Selecting the population, life expectancy, and population per area
--	note the use of the 'as' keyword

SELECT name, population, lifeexpectancy, surfacearea, population/surfacearea AS Pop_per_area
FROM country;
-- pop/surf AS just renames the column name for the new math done (Which was population /(divided) by surfacearea


--How many different districts are in my stuff
SELECT DISTINCT district
FROM city;
--gets rid of duplicates 