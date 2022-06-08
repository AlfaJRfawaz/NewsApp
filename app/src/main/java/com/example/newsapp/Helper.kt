package com.example.newsapp

import android.content.Intent
import com.example.newsapp.databinding.NewsHeadlineBinding

fun bindingNewsHeadLine(binding : NewsHeadlineBinding,position : Int){
    binding.apply {
        imgHeadline.setImageResource(DataNews.photoHeadline[0])
        tvTitleHeadline.text = DataNews.titleHeadline[0]
        tvDescHeadline.text = DataNews.contentHeadline[0]
        tvDateHeadline.text = DataNews.dateHeadline[0]
        tvAuthorHeadline.text = DataNews.authorHeadline[0]
    }
    binding.root.setOnClickListener {
        val intentToDetail = Intent(binding.root.context, DetailActivity::class.java)
        intentToDetail.putExtra(DetailActivity.EXTRA_TITLE_HEADLINE, DataNews.titleHeadline[position])
        intentToDetail.putExtra(DetailActivity.EXTRA_IMG_HEADLINE, DataNews.photoHeadline[position])
        intentToDetail.putExtra(DetailActivity.EXTRA_CONTENT_HEADLINE, DataNews.contentHeadline[position])
        intentToDetail.putExtra(DetailActivity.EXTRA_DATE_HEADLINE, DataNews.dateHeadline[position])
        intentToDetail.putExtra(DetailActivity.EXTRA_AUTHOR_HEADLINE, DataNews.authorHeadline[position])
        binding.root.context.startActivity(intentToDetail)
    }
}