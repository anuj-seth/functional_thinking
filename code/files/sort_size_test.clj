(ns functional-thinking.sort-size-test
  (:require [clojure.test :refer :all]))

; sort the vector by size of items
                                        
(deftest sort-size-test
  ; make the test cases pass
  (is (= ["is" "today" "holiday"]
         (__ ["holiday" "is" "today"])))
  (is (= [[1 2] [1 2 3] [1 2 3 4] [1 2 3 4]] 
         (__ [[1 2 3 4] [1 2] [1 2 3] [1 2 3 4]])))
  (is (= [{:a 1} #{1 2} "abc"]
         (__ [#{1 2} {:a 1} "abc"]))))

