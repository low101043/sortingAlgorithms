module BubbleSort where

-- Should Perform Bubble Sort

swap :: Ord a => [a] -> [a]
swap [] = []
swap [x] = [x]
swap (x:y:xs) | x > y     = (y:x:xs)
              | otherwise = (x:y:xs)

innerLoop :: Ord a => Int -> [a] -> [a]
innerLoop 0 xs = xs
innerLoop n xs = case swap xs of
                    [x] -> [x]
                    (x:y:xs) -> x: (innerLoop (n-1) (y:xs))

outerLoop :: Ord a => Int -> [a] -> [a]
outerLoop 0 xs = xs
outerLoop n xs = outerLoop (n-1) (innerLoop (length xs) xs)

bubbleSort :: Ord a => [a] -> [a]
bubbleSort xs = outerLoop (length xs) xs