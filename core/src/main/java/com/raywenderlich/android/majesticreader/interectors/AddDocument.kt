package com.raywenderlich.android.majesticreader.interectors

import com.raywenderlich.android.majesticreader.data.repositories.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

/**
 * Adding a new document to the library.
 * @author Saiful Islam Sajon
 * @param documentRepository DocumentRepository
 */
class AddDocument(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke(document: Document) = documentRepository.addDocument(document)
}