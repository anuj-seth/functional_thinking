(ns functional-thinking.sets-test
  (:require [clojure.test :refer :all]
            [clojure.set]))

(is (= __
       (set '(:a :a :b :c :c :c :c :d :d))))

(is (= __
       (clojure.set/union #{:a :b :c}
                          #{:b :c :d})))

(is (= #{1 2 3 4}
       (conj #{1 4 3}
             __)))

(is (= __
       (contains? #{:a :b}
                  :a)))

(is (= __
       (:c #{:a :b})))

(is (= __
       (#{+ -} +)))
