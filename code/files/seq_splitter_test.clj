(ns functional-thinking.seq-splitter-test
  (:require [clojure.test :refer :all]))

; write a function which splits a sequence 
; into 2 parts at given position

(deftest seq-splitter-test
  ; make the below test cases pass
  (let [splitter __]
    (is (= (splitter 3 [1 2 3 4 5 6])
           [[1 2 3] [4 5 6]]))
    (is (= (splitter 1 [:a :b :c :d])
           [[:a] [:b :c :d]]))
    (is (= (splitter 2 [[1 2] [3 4] [5 6]])
           [[[1 2] [3 4]] [[5 6]]]))))

