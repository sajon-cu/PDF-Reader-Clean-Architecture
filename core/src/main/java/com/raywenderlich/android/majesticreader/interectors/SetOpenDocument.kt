package com.raywenderlich.android.majesticreader.interectors

import com.raywenderlich.android.majesticreader.data.repositories.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

/**
 * Setting currently opened documents
 * @author Saiful Islam Sajon
 * @param documentRepository DocumentRepository
 */
class SetOpenDocument(private val documentRepository: DocumentRepository) {
    operator fun invoke(document: Document) = documentRepository.setOpenDocument(document)
}