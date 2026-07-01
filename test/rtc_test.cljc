(ns rtc-test
  (:require [clojure.test :refer [deftest is testing]]
            [rtc]))
(deftest namespace-loads
  (testing "the restored CLJC namespace loads"
    (is (some? rtc))))
