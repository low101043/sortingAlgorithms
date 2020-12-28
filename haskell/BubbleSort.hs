module BubbleSort where

-- Should Perform Bubble Sort

swap :: Ord a => [a] -> [a]  --Swaps the two elements at top around
swap [] = []
swap [x] = [x]
swap (x:y:xs) | x > y     = (y:x:xs)
              | otherwise = (x:y:xs)

innerLoop :: Ord a => Int -> [a] -> [a]  -- The innser loop of bubble sort
innerLoop 0 xs = xs
innerLoop n xs = case swap xs of
                    [x] -> [x]
                    (x:y:xs) -> x: (innerLoop (n-1) (y:xs))

outerLoop :: Ord a => Int -> [a] -> [a]  -- The other loop of bubble sort
outerLoop 0 xs = xs
outerLoop n xs = outerLoop (n-1) (innerLoop (length xs) xs)

bubbleSort :: Ord a => [a] -> [a] -- bubble sort
bubbleSort xs = outerLoop (length xs) xs