(ns functional-thinking.let-test
  (:require [clojure.test :refer :all]))

(deftest let-test
  ; make the below tests pass
  (is (= 7 (let [x 5] (+ 2 x))))
  (is (= 7 (let [x 3, y 10] (- y x))))
  (is (= 7 (let [x 21] 
             (let [y 3] (/ x y)))))

  ; find values for x, y and z to make all
  ; tests evaluate to true
  (is (= 10 (let [y 3 x 7] (+ x y))))
  (is (= 4 (let [z 1 y 3] (+ y z))))
  (is (= 1 (let [z 1] z))))


