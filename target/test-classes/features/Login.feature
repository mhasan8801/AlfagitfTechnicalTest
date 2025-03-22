@login
Feature: Login

  Scenario: User check functionality show/hide password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "082232139882" as Phone Number
    And On Login page, The user input "Password123!" as Password
    Then On Login page, The user verify functionality show password is "Password123!"
    And On Login page, The user verify functionality hide password is "............"

  Scenario: User access Reset Password page
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user click "Reset Password" label
    Then The user verify already on Reset Password page

  Scenario: User access Sign Up page
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user click "Daftar Sekarang" label
    Then The user verify already on Sign Up page

  Scenario: User login with registered phone number and invalid password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "082232139882" as Phone Number
    And On Login page, The user input "Invalid123!" as Password
    And On Login page, The user click "Selanjutnya" button
    And The user verify error message in Password field showed is "Password Anda salah. Silahkan coba lagi."

  Scenario: User login with registered member card number and invalid password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "9990012524010782" as Phone Number
    And On Login page, The user input "Invalid123!" as Password
    And On Login page, The user click "Selanjutnya" button
    And The user verify error message in Password field showed is "Password Anda salah. Silahkan coba lagi."

  Scenario: User login with random member card number and invalid password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "9999999999999999" as Phone Number
    And On Login page, The user input "Invalid123!" as Password
    And On Login page, The user click "Selanjutnya" button
    Then The user verify login failed because device already connect with another account

  Scenario: User login with valid phone number and valid password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "082232139882" as Phone Number
    And On Login page, The user input "MifulAlfagift2023!" as Password
    And On Login page, The user click "Selanjutnya" button
    Then The user verify successfully login

  Scenario: User login with valid member card number and valid password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "9990012524010782" as Phone Number
    And On Login page, The user input "MifulAlfagift2023!" as Password
    And On Login page, The user click "Selanjutnya" button
    Then The user verify successfully login

  Scenario: User relogin with another registered account in same device
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "082129319211" as Phone Number
    And On Login page, The user input "Password123!" as Password
    And On Login page, The user click "Selanjutnya" button
    Then The user verify login failed because device already connect with another account

  Scenario: User login without input phone number/member card number and password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user click "Selanjutnya" button
    Then The user verify error message in Phone Number field showed is "Mohon isi Nomor HP/No. kartu member"
    And The user verify error message in Password field showed is "Mohon isi Password"

  Scenario: User login without input password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "082232139882" as Phone Number
    And On Login page, The user click "Selanjutnya" button
    And The user verify error message in Password field showed is "Mohon isi Password"

  Scenario: User login without input phone number/member card number
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "Password123!" as Password
    And On Login page, The user click "Selanjutnya" button
    Then The user verify error message in Phone Number field showed is "Mohon isi Nomor HP/No. kartu member"

  Scenario: User login with phone number less than 10 character and password less than 8 character
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "089" as Phone Number
    And On Login page, The user input "Pass" as Password
    And On Login page, The user click "Selanjutnya" button
    Then The user verify error message in Phone Number field showed is "Nomor HP harus di antara 10 hingga 16 digit"
    And The user verify error message in Password field showed is "Kata sandi minimum 8 karakter"

  Scenario: User login with invalid phone number/member card number and invalid password
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "0891231231231231" as Phone Number
    And On Login page, The user input "Password123!" as Password
    And On Login page, The user click "Selanjutnya" button
    Then The user verify login failed because device already connect with another account

  Scenario: User login with member card number less than 16 character and password less than 8 character
    Given The user open Alfagift App
    When On Main page, The user click "MASUK" button
    And On Login page, The user input "999" as Phone Number
    And On Login page, The user input "Pass" as Password
    And On Login page, The user click "Selanjutnya" button
    Then The user verify error message in Phone Number field showed is "No. kartu member harus 16 digit"
    And The user verify error message in Password field showed is "Kata sandi minimum 8 karakter"
