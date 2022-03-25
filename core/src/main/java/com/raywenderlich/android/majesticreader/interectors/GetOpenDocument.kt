package com.raywenderlich.android.majesticreader.interectors

import com.raywenderlich.android.majesticreader.data.repositories.DocumentRepository

/**
 * Getting currently opened documents
 * @author Saiful Islam Sajon
 * @param documentRepository DocumentRepository
 */
class GetOpenDocument(private val documentRepository: DocumentRepository) {
    operator fun invoke() = documentRepository.getOpenDocument()
}