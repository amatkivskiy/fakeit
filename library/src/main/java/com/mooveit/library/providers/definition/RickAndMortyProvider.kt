package com.mooveit.library.providers.definition

interface RickAndMortyProvider : Provider {

    fun character(): String
    fun location(): String
    fun quote(): String
}