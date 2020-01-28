(ns assignments.conditions-test
  (:require [clojure.test :refer :all]
            [assignments.conditions :refer :all]))

(deftest safe-division
  (testing "non zero denominator"
    (is (= 2 (safe-divide 4 2))))
  (testing "zero denominator"
    (is (nil? (safe-divide 3 0)))))

(deftest informative-division
  (testing "non zero denominator"
    (is (= 2 (informative-divide 4 2))))
  (testing "zero denominator"
    (is (= :infinite (informative-divide 3 0)))))

(deftest harishchandra-function
  (testing "true value"
    (is (= 2 (harishchandra 2))))
  (testing "false value"
    (is (= nil (harishchandra nil)))))

(deftest yudishtira-function
  (testing "true value"
    (is (= 2 (yudishtira 2))))
  (testing "false value"
    (is (= :ashwathama (yudishtira false)))))

(deftest duplicate-first-func
  (testing "when collection is empty"
    (is (= nil (duplicate-first []))))
  (testing "when collection is not empty"
    (is (= [1 1 2 3] (duplicate-first [1 2 3])))))

(deftest five-point-someone-func
  (testing "when y is 5"
    (is (= :chetan-bhagat (five-point-someone 3 5))))
  (testing "when x is 5"
    (is (= :satan-bhagat (five-point-someone 5 3))))
  (testing "when x is greater than y"
    (is (= :greece (five-point-someone 7 6))))
  (testing "when any of conditions does not match"
    (is (= :universe (five-point-someone 10 10)))))

(deftest zero-separated-palindrome-func
  (testing "when collection is provided"
    (is (= '(4 3 2 0 2 3 4) (zero-separated-palindrome [1 2 3])))))

(deftest zero-aliases-func
  (testing "when zero is provided"
    (is (= :zero (zero-aliases 0))))
  (testing "when [] is provided"
    (is (= :empty (zero-aliases []))))
  (testing "when {} is provided"
    (is (= :empty-map (zero-aliases {}))))
  (testing "when empty string is provided"
    (is (= :empty-string (zero-aliases ""))))
  (testing "when non zero value is provided"
    (is (= :not-zero (zero-aliases 1))))
  (testing "when #{} is provided"
    (is (= :empty-set (zero-aliases #{})))))

(deftest order-in-words-func
  (testing "when x is y and y is greater than z"
    (is (= [:x-greater-than-y :y-greater-than-z] (order-in-words 4 3 2))))
  (testing "when x is y and z is greater than x"
    (is (= [:x-greater-than-y :z-greater-than-x] (order-in-words 4 3 5))))
  (testing "when z is greater than x"
    (is (= [:z-greater-than-x] (order-in-words 2 3 4)))))

(deftest repeat-and-truncate-func
  (testing "should return empty sequence when given empty list"
    (is (= '() (repeat-and-truncate '() true true 0))))
  (testing "repeat and truncate"
    (is (= '(0 1 2 3 0 1) (repeat-and-truncate (range 4) true true 6)))))

