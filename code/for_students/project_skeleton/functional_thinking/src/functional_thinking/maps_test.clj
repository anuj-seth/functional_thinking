(ns functional-thinking.maps-test
  (:require [clojure.test :refer :all]))


(is (= __
       ((hash-map :a 10, :b 20, :c 30)
        :b)))

(is (= {:a 1, :b 2, :c 3}
       (conj {:a 1}
             __
             [:c 3])))

(is (= __
       (:b {:a 10, :b 20, :c 30})))

; and what is happening here ?
(is (= __
       (({"+" +} "+")
        1 2 3)))

