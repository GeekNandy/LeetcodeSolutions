Select   *
FROM     CINEMA
WHERE    DESCRIPTION <> 'boring' AND
         ID%2 != 0
ORDER BY RATING DESC;
