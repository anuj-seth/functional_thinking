(ns functional-thinking.sort-size-test
  (:require [clojure.test :refer :all]))

; sort the vector by size of items
                                        
(deftest sort-size-test
  ; make the test cases pass
  (is (= ["is" "today" "holiday"]
         (sort-by count ["holiday" "is" "today"])))
  (is (= [[1 2] [1 2 3] [1 2 3 4] [1 2 3 4]] 
         (sort-by count [[1 2 3 4] [1 2] [1 2 3] [1 2 3 4]])))
  (is (= [{:a 1} #{1 2} "abc"]
         (sort-by count [#{1 2} {:a 1} "abc"]))))

