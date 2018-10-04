(ns functional-thinking.maps-test
  (:require [clojure.test :refer :all]))


(deftest maps-test
  ; make the below tests pass
  (is (= 20 ((hash-map :a 10, :b 20, :c 30) :b)))
  (is (= {:a 1, :b 2, :c 3} (conj {:a 1} [:b 2] [:c 3])))
  (is (= 20 (:b {:a 10, :b 20, :c 30})))
  ; and what is happening here ?
  (is (= 6 (({"+" +} "+")
            1 2 3))))

