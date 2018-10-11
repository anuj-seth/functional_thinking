(ns functional-thinking.let-test
  (:require [clojure.test :refer :all]))

(deftest let-test
  ; make the below tests pass
  (is (= __ (let [x 5] (+ 2 x))))
  (is (= __ (let [x 3, y 10] (- y x))))
  (is (= __ (let [x 21]
              (let [y 3] (/ x y)))))

  ; find values for x, y and z to make all
  ; tests evaluate to true
  (is (= 10 (let __ (+ x y))))
  (is (= 4 (let __ (+ y z))))
  (is (= 1 (let __ z))))
