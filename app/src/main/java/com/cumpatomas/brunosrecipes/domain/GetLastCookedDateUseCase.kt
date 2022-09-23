package com.cumpatomas.brunosrecipes.domain

import com.cumpatomas.brunosrecipes.domain.model.RecipesModel
import com.cumpatomas.brunosrecipes.domain.model.toDomain
import com.cumpatomas.brunosrecipes.manualdi.LocalDatabaseModule

class GetLastCookedDateUseCase {

    private val dao = LocalDatabaseModule.db.getRecipesDao()

    suspend operator fun invoke(id: Int): RecipesModel? {
       return dao.getRecipeById(id)?.toDomain()
    }
}