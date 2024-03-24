
/*Pivot the Occupation column in OCCUPATIONS so that each Name is sorted alphabetically and displayed underneath its corresponding Occupation. The output column headers should be Doctor, Professor, Singer, and Actor, respectively.

Note: Print NULL when there are no more names corresponding to an occupation.

Input Format

The OCCUPATIONS table is described as follows:



Occupation will only contain one of the following values: Doctor, Professor, Singer or Actor.

https://www.hackerrank.com/challenges/occupations/problem?isFullScreen=true
*/


SELECT
    MAX(Doctor) AS Doctor,
    MAX(Professor) AS Professor,
    MAX(Singer) AS Singer,
    MAX(Actor) AS Actor
FROM
    (SELECT 
        ROW_NUMBER() OVER (PARTITION BY Occupation ORDER BY Name) AS RowNum,
        CASE WHEN Occupation = 'Doctor' THEN Name END AS Doctor,
        CASE WHEN Occupation = 'Professor' THEN Name END AS Professor,
        CASE WHEN Occupation = 'Singer' THEN Name END AS Singer,
        CASE WHEN Occupation = 'Actor' THEN Name END AS Actor
    FROM
        OCCUPATIONS) AS Temp
GROUP BY
    RowNum
ORDER BY
    RowNum;
