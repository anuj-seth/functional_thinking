(ns functional-thinking.doubler-test
  (:require [clojure.test :refer :all]))

(defn doubler
  [a]
  (* 2 a))

(deftest doubler-test
  ; make the below tests pass
  ; by writing a function which doubles a number
  (is (= (doubler 2) 4))
  (is (= (doubler 3) 6))
  (is (= (doubler 11) 22))
  (is (= (doubler 7) 14)))

