module InsertionSort where

insert :: Ord a => a -> [a] -> [a]
insert x []     = [x]
insert x (y:ys) | x <= y    = x : y : ys
                | otherwise = y : insert x ys

isort :: Ord a => [a] -> [a]  --Performs insertion sort
isort []     = []
isort (x:xs) = insert x (isort xs)