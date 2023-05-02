package com.example.mymvvm

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

// the class is used to provide dependencies to other files in the android app
@InstallIn
@Module
class AppModule {
    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit{
        return Retrofit.Builder()
            .baseUrl("https://www.jsonplaceholder.typicode.com")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    }
    // method to provide the instance of the interface class that defines the HTTP methods

    @Singleton
    @Provides
    fun provideSerService(retrofit: Retrofit): UserService{
        return retrofit.create(UserService::class.java)
    }



}