(ns functional-thinking.doubler-test
  (:require [clojure.test :refer :all]))

(deftest doubler-test
  ; make the below tests pass
  ; by writing a function which doubles a number
  (is (= (__ 2) 4))
  (is (= (__ 3) 6))
  (is (= (__ 11) 22))
  (is (= (__ 7) 14)))

