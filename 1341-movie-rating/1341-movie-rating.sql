(
    SELECT U.name AS results
    From Users AS U
    JOIN MovieRating AS MR ON U.user_id = MR.user_id
    GROUP BY MR.user_id
    ORDER BY COUNT(*) DESC , U.name ASC
    LIMIT 1
)
UNION ALL
(
    SELECT M.title AS results
    FROM Movies AS M
    JOIN MovieRating AS MR ON M.movie_id = MR.movie_id
    WHERE MR.created_at BETWEEN '2020-02-01' AND '2020-02-29'
    GROUP BY MR.movie_id
    ORDER BY AVG(MR.rating) DESC , M.title ASC
    LIMIT 1
)