(ns functional-thinking.log-analyzer
  (:require [clojure.string :as str]
            [clojure.java.io :as io]))

(defn split-line
  "Split a string on the given delimiter and
  return a vector of fields"
  [line delimiter]
  (str/split line delimiter))

(defn read-log-file
  "Read a file, split on newlines and
  return a vector of lines in the file"
  [filename]
  (split-line (slurp (io/resource filename))
              #"\n"))

(defn to-hashmap
  [ks line]
  (into {}
        (map vector
             ks
             (split-line line #";"))))

(defn how-many-of-each-type
  []
  (let [log-lines (read-log-file "sample_1.log")
        ks (map keyword
                (split-line (first log-lines) #";"))
        log-data (map to-hashmap
                      (repeat ks)
                      (rest log-lines))]
    (frequencies (map :trx_type
                      log-data))))

(defn calculate-statistics
  []
  (let [log-lines (read-log-file "sample_1.log")
        ks (map keyword
                (split-line (first log-lines) #";"))
        log-data (map to-hashmap
                      (repeat ks)
                      (rest log-lines))]
    (reduce (fn [acc data]
              (let [type (:trx_type data)
                    response-time (Integer/parseInt (:response_time data))]
                (update-in (update-in acc
                                      [type :count]
                                      (fnil inc 0))
                           [type :response_time]
                           (fnil + 0)
                           response-time)))

     {}
     log-data)))


(calculate-statistics)
