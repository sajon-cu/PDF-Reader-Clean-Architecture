package com.raywenderlich.android.majesticreader.interectors

import com.raywenderlich.android.majesticreader.data.repositories.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Document

/**
 * Getting all bookmarks for currently open documents.
 * @author Saiful Islam Sajon
 * @param bookmarkRepository BookmarkRepository
 */
class GetBookmarks(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document) = bookmarkRepository.getBookmarks(document)
}