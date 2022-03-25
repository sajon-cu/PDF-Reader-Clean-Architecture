package com.raywenderlich.android.majesticreader.data.datasource

import com.raywenderlich.android.majesticreader.domain.Document

interface OpenDocumentDataSource {
    fun setOpenDocument(document: Document)

    fun getOpenDocument(): Document
}