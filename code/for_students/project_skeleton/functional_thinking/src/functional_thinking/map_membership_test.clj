(ns functional-thinking.map-membership-test
  (:require [clojure.test :refer :all]))

; map a given set of input values to other values
; we only need to map the strings - "a", "b", "c", "d"
; the mapping required is - "a" 1, "b" 2, "c" 3, "d" 4

(is (= [1 2 3 4]
       (__ ["a" "b" "c" "d"])))

(is (= [3 2]
       (__ ["c" "b"])))

(is (= [4]
       (__ ["d"])))

(is (= [nil]
       (__ ["z"])))
