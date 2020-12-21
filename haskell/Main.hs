module Main where

import Data.Char

import BubbleSort
import InsertionSort
import MergeSort
import QuickSort

main :: IO ()
main = do
        putStrLn "Welcome to Sorting Algorithms using Haskell"
        x <- menu
        case x of
            1 -> do
                   y <- input
                   putStrLn "Performing Bubble Sort"
                   putStrLn (show (bubbleSort y))
                   main
            2 -> do
                   y <- input
                   putStrLn "Performing Insertion Sort"
                   putStrLn (show (isort y))
                   main
            3 -> do
                   y <- input
                   putStrLn "Performing Merge Sort"
                   putStrLn (show (msort y))
                   main
            4 -> do
                   y <- input
                   putStrLn "Performing Quick Sort"
                   putStrLn (show (qsort y))
                   main
            5 -> do
                   return ()

menu :: IO Int
menu = do
        putStrLn "\nPlease select an option to choose a Sorting Algorithm.  \n 1. Bubble Sort  \n 2. Insertion Sort \n 3. Merge Sort \n 4. Quick Sort \n 5. Exit \n Enter 1, 2, 3, 4 or 5: "
        xs <- getLine
        case xs of
          "1" -> return 1
          "2" -> return 2
          "3" -> return 3
          "4" -> return 4
          "5" -> return 5
          otherwise -> do
                         answer <- menu
                         return answer

inputList :: Int -> [Int] -> IO [Int]
inputList 0 xs = return (reverse xs)
inputList n (xs) = do
                   x <- getLine
                   if x /= [] && all isDigit x
                      then do 
                              let xInt = read x :: Int
                              inputList (n-1) ( xInt:xs)
                      else
                          do
                            putStrLn "Wrong Input"
                            inputList n xs
                        
howMany :: IO Int
howMany = do
            putStrLn "\nPlease enter the number of elements to be sorted: "
            xs <- getLine
            if xs /= [] && all isDigit xs 
              then return (read xs)
            else 
              do 
                putStrLn "Invalid Number"
                howMany

input :: IO [Int]
input = do
          x <- howMany
          putStrLn ("Please enter " ++ show x ++ " Integers:")
          inputList x []