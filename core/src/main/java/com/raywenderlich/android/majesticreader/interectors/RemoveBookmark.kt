package com.raywenderlich.android.majesticreader.interectors

import com.raywenderlich.android.majesticreader.data.repositories.BookmarkRepository
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

/**
 * Removing a bookmark from a currently open document
 * @author Saiful Islam Sajon
 * @param bookmarkRepository BookmarkRepository
 */
class RemoveBookmark(private val bookmarkRepository: BookmarkRepository) {
    suspend operator fun invoke(document: Document, bookmark: Bookmark) = bookmarkRepository.removeBookmark(document, bookmark)
}