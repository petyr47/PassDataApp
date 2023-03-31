package com.petyr47.passdata.mrz.model

data class MrzData(
    val documentType : String,
    val documentCode : String,
    val nationality : String,
    val documentNumber : String,
    val surname : String,
    val givenNames : String,
    val dateOfBirth : String,
    val personalNumber : String,
    val gender : String,
    val height : String,
    val dateOfIssue : String,
    val dateOfExpiry : String,
    val issuingCountry : String
)
