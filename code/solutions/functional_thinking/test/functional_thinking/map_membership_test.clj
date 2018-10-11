(ns functional-thinking.map-membership-test
  (:require [clojure.test :refer :all]))

; map a given set of input values to other values
; we only need to map the strings - "a", "b", "c", "d"
; the mapping required is - "a" 1, "b" 2, "c" 3, "d" 4

(deftest map-membership-test
  ; make the below test cases pass
  (is (= [1 2 3 4] (map {"a" 1, "b" 2, "c" 3, "d" 4} 
                     ["a" "b" "c" "d"])))
  (is (= [3 2] (map {"a" 1, "b" 2, "c" 3, "d" 4}
                 ["c" "b"])))
  (is (= [4] (map {"a" 1, "b" 2, "c" 3, "d" 4}
               ["d"])))
  (is (= [nil] (map {"a" 1, "b" 2, "c" 3, "d" 4}
                 ["z"]))))

