-- ORDERING RESULTS

-- Populations of all countries in descending order
SELECT name, population
FROM country
ORDER BY population DESC;
-- best practice to use ASC and DESC

--Names of countries and continents in ascending order
SELECT name, continent
FROM country
ORDER BY name ASC;

-- LIMITING RESULTS

-- The name and average life expectancy of the countries with the 10 highest life expectancies.
SELECT name, lifeexpectancy
FROM country
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10;
OFFSET 10; --skips the first 10

--what is the biggest city by population
SELECT name, population
FROM city
WHERE population IS NOT NULL
ORDER BY population DESC;

-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city
SELECT name ||', '||district AS city_state
FROM city
WHERE district IN ('California', 'Oregon', 'Washington')
ORDER BY district, name;

-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World
SELECT AVG(lifeexpectancy) AS avg_life_expectancy
FROM country
WHERE lifeexpectancy IS NOT NULL;

-- Total population in Ohio
SELECT SUM(population) AS sum_pop_ohio
FROM city
WHERE district = 'Ohio';

-- The surface area of the smallest country in the world
SELECT surfacearea,name
FROM country
ORDER BY surfacearea ASC
LIMIT 1;

-- The 10 largest countries in the world
SELECT surfacearea,name
FROM country
ORDER BY surfacearea DESC
LIMIT 10;

SELECT population,name
FROM country
ORDER BY population DESC
LIMIT 10;

-- The number of countries who declared independence in 1991
SELECT COUNT(*)
FROM country
WHERE indepyear = 1991;

-- GROUP BY
--SELECT,FROM,WHERE(optional) GROUP BY or ORDER BY
-- Count the number of countries where each language is spoken, ordered from most countries to least
SELECT language, COUNT(*) AS count_countries
FROM countrylanguage
GROUP BY language
ORDER BY count_countries DESC;

-- Average life expectancy of each continent ordered from highest to lowest
SELECT continent, AVG(lifeexpectancy)
FROM country
WHERE lifeexpectancy IS NOT NULL
GROUP BY continent
ORDER BY AVG(lifeexpectancy) DESC;

-- Exclude Antarctica from consideration for average life expectancy
SELECT continent, AVG(lifeexpectancy)
FROM country
WHERE lifeexpectancy IS NOT NULL
GROUP BY continent
ORDER BY AVG(lifeexpectancy) DESC;

-- Sum of the population of cities in each state in the USA ordered by state name
SELECT district, SUM(population) AS sum_pop
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY SUM(population) DESC;

SELECT district, SUM(population) AS sum_pop
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district ASC;

-- The average population of cities in each state that has an average population > 1,000,000 in the USA ordered by state name
SELECT district, round(AVG(population),2) AS avg_pop
FROM city
WHERE countrycode = 'USA'
GROUP BY district
HAVING AVG(population) > 1000000
ORDER BY district ASC;

SELECT district, AVG(population) AS avg_pop
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district DESC;

-- SUBQUERIES
-- Find the names of cities under a given government leader
SELECT name, countrycode
FROM city
WHERE countrycode IN (

                SELECT code
                FROM country
                WHERE headofstate LIKE '%Bush%'
                );
-- Find the names of cities whose country they belong to has not declared independence yet
SELECT name, countrycode
FROM city
WHERE countrycode IN(

                SELECT code 
                FROM country 
                WHERE indepyear IS NULL);

-- Additional samples
-- You may alias column and table names to be more descriptive

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.
SELECT name, countrycode AS cc
FROM city c
WHERE countrycode IN(
                SELECT code 
                FROM country 
                WHERE indepyear IS NULL);

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)

-- While you can use TOP to limit the number of results returned by a query,
-- in SQL Server it is recommended to use OFFSET and FETCH if you want to get
-- "pages" of results. For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.

-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.
-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.
SELECT SUM(population) as sum_pop, round(AVG(population),2) as avg_pop, COUNT(*) as total_rows
FROM city;

-- Gets the MIN population and the MAX population from the city table.
SELECT district, MIN(population) as min_pop, MAX(population) as max_pop
FROM city
WHERE countrycode = 'USA'
GROUP BY district;

-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
SELECT countrycode, MIN(population) AS min_pop, MAX(population) AS max_pop
FROM city
GROUP BY countrycode;