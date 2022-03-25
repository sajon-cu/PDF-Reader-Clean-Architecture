package com.raywenderlich.android.majesticreader.interectors

import com.raywenderlich.android.majesticreader.data.repositories.BookmarkRepository
import com.raywenderlich.android.majesticreader.data.repositories.DocumentRepository
import com.raywenderlich.android.majesticreader.domain.Document

/**
 * Getting all bookmarks for currently open documents.
 * @author Saiful Islam Sajon
 * @param documentRepository DocumentRepository
 */
class GetDocuments(private val documentRepository: DocumentRepository) {
    suspend operator fun invoke() = documentRepository.getDocuments()
}