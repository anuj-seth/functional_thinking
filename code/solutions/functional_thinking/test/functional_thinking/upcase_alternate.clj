(ns functional-thinking.upcase-alternate
  (:require [clojure.test :refer :all]))

(defn upcase-alternate-functional
  [s]
  (let [out-chars (map (fn [c f]
                         (f c))
                       s
                       (cycle [str clojure.string/upper-case]))]
    (clojure.string/join "" out-chars)))

(defn upcase-alternate-map
  [s]
  (let [out-chars (map-indexed (fn [idx v]
                                 (if (even? idx)
                                   (str v)
                                   (clojure.string/upper-case v)))
                               s)]
    (clojure.string/join "" out-chars)))

(is (= "aBc"
       (upcase-alternate-map "abc")
       (upcase-alternate-functional "abc")))

(is (= "aBcDeF"
       (upcase-alternate-map "abcdef")
       (upcase-alternate-functional "abcdef")))


(is (= "a"
       (upcase-alternate-map "a")
       (upcase-alternate-functional "a")))
