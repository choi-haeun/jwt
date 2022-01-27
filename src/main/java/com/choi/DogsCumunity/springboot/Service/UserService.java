package com.choi.DogsCumunity.springboot.Service;

import com.choi.DogsCumunity.springboot.domain.user.User;
import com.choi.DogsCumunity.springboot.domain.user.UserRepository;
import com.choi.DogsCumunity.springboot.web.dto.userDto.UserSignRequestDto;
import com.choi.DogsCumunity.springboot.web.dto.userDto.UserUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long userSingUp(UserSignRequestDto requestDto){
        return userRepository.save(requestDto.toEntity()).getUserNum();
    }

    public String update(String userId, UserUpdateRequestDto requestDto){
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("조회되는 회원이 없습니다"));


    }
}
