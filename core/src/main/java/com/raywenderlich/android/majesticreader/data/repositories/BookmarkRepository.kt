package com.raywenderlich.android.majesticreader.data.repositories

import com.raywenderlich.android.majesticreader.data.datasource.BookmarkDataSource
import com.raywenderlich.android.majesticreader.domain.Bookmark
import com.raywenderlich.android.majesticreader.domain.Document

class BookmarkRepository(private val bookmarkDataSource: BookmarkDataSource) {
    suspend fun addBookmark(document: Document, bookmark: Bookmark) = bookmarkDataSource.add(document, bookmark)

    suspend fun getBookmarks(document: Document) = bookmarkDataSource.read(document)

    suspend fun removeBookmark(document: Document, bookmark: Bookmark) = bookmarkDataSource.remove(document, bookmark)
}