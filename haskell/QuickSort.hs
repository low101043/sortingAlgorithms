module QuickSort where

qsort :: Ord a => [a] -> [a]

qsort [] = []

qsort xs = (qsort lower) ++ [x] ++ (qsort upper)
            where
                x = xs !! 0
                lower = [y | y <- (tail xs), y <= x]
                upper = [z | z <- (tail xs), z > x]