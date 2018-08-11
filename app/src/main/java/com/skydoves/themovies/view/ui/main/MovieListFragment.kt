package com.skydoves.themovies.view.ui.main

import android.arch.lifecycle.Observer
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.skydoves.themovies.R
import com.skydoves.themovies.models.Movie
import com.skydoves.themovies.models.Resource
import com.skydoves.themovies.models.Status

/**
 * Developed by skydoves on 2018-08-11.
 * Copyright (c) 2018 skydoves rights reserved.
 */

class MovieListFragment : Fragment() {

    private lateinit var rootView: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        rootView = inflater.inflate(R.layout.main_fragment_movie, container, false)
        return rootView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        observeViewModels()
    }

    private fun observeViewModels() {
//        viewModel.movieListLiveData.observe(this, Observer { it?.let { updateMovieList(it) }})
    }

    private fun updateMovieList(resource: Resource<List<Movie>>) {
        when(resource.status) {
            Status.SUCCESS -> { }
            Status.ERROR -> { }
            Status.LOADING -> { }
        }
    }
}
