(ns functional-thinking.sets-test
  (:require [clojure.test :refer :all]
            [clojure.set]))


(deftest sets-test
  ; make the below tests pass
  (is (= #{:a :b :c :d} (set '(:a :a :b :c :c :c :c :d :d))))  
  (is (= #{:a :b :c :d} (clojure.set/union #{:a :b :c} #{:b :c :d})))
  (is (= #{1 2 3 4} (conj #{1 4 3} 2)))
  (is (= true (contains? #{:a :b} :a)))
  (is (= nil (:c #{:a :b})))
  (is (= + (#{+ -} +))))



