(ns functional-thinking.log-analyzer
  (:require [clojure.string :as str]))


(defn split-line
  "Split a string on the given delimiter and
  return a vector of fields"
  [line delimiter]
  (str/split line delimiter))

(defn read-log-file
  "Read a file, split on newlines and
  return a vector of lines in the file"
  [filename]
  (split-line (slurp filename)
              #"\n"))

(defn how-many-of-each-type
  "calculate the number of transactions by type"
  []
  (let [log-path "/home/anuj/course_files/for_students/project_skeleton/functional_thinking/src/functional_thinking"
        log-file "sample_1.log"
        log-lines (read-log-file (str log-path "/" log-file))]))
    

(defn calculate-statistics
  "sum the response time by transaction type and
  count transactions by type"
  []
  (let [log-path "/home/anuj/course_files/for_students/project_skeleton/functional_thinking/src/functional_thinking"
        log-file "sample_1.log"
        log-lines (read-log-file (str log-path "/" log-file))]))
       
    
      
