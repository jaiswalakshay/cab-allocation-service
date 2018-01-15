package com.akshay.services;

import com.akshay.dao.TeamMemberRepository;
import com.akshay.domain.TeamMember;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class MainService {

    private static final Logger logger = LoggerFactory.getLogger(MainService.class);

    @Autowired
    TeamMemberRepository teamMemberRepository;

    private static final Gson gson = new Gson();

    @Transactional
    public TeamMember registerTeamMember(TeamMember teamMember) {
        teamMember.setTeamMemberId(teamMember.getTeamMemberId());
        logger.info("Team member ------> " + gson.toJson(teamMember));
        return teamMemberRepository.save(teamMember);
    }

}
