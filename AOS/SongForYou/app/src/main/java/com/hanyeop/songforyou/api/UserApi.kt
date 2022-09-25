package com.hanyeop.songforyou.api

import android.provider.ContactsContract.CommonDataKinds.Email
import com.hanyeop.songforyou.base.BaseResponse
import com.hanyeop.songforyou.model.dto.UserDto
import com.hanyeop.songforyou.utils.JWT
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Path

interface UserApi {

    // 일반 회원가입
    @POST("/user/signUp")
    suspend fun signUpUser(
        @Header(JWT) token: String,
        @Body userDto: UserDto
    ): BaseResponse<String>

    // 일반 로그인
    @POST("/user/login")
    suspend fun loginUser(
        @Body map: HashMap<String, String>
    ): BaseResponse<String>

    // 이메일 중복 검사
    @GET("/user/checkemail/{userEmail}")
    suspend fun checkEmail(
        @Path("userEmail") userEmail: String
    ): BaseResponse<String>

    // 닉네임 중복 검사
//    @GET("/user/checknickname/{userNickname}")
//    suspend fun chec

    // 이메일 인증번호 전송


    // 이메일 인증번호 전송


    // 비밀번호 찾기


}