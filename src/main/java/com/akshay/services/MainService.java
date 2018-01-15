package com.akshay.services;

import com.akshay.dao.CabRepository;
import com.akshay.dao.TeamMemberRepository;
import com.akshay.domain.Cab;
import com.akshay.domain.TeamMember;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MainService {

    private static final Logger logger = LoggerFactory.getLogger(MainService.class);

    @Autowired
    TeamMemberRepository teamMemberRepository;

    @Autowired
    CabRepository cabRepository;

    private static final Gson gson = new Gson();

    @Transactional
    public TeamMember registerTeamMember(TeamMember teamMember) {
        teamMember.setTeamMemberId(teamMember.getTeamMemberId());
        logger.info("Team member ------> " + gson.toJson(teamMember));
        return teamMemberRepository.save(teamMember);
    }

    @Transactional
    public List<Cab> registerCabs(List<Cab> listOfCab) {
        logger.info("Cabs ------> " + gson.toJson(listOfCab));
        for (Cab cab: listOfCab){
            this.registerCab(cab);
        }
        return listOfCab;
    }

    @Transactional
    public Cab registerCab(Cab cab) {
        logger.info("Cab ------> " + gson.toJson(cab));
        return cabRepository.save(cab);
    }

}
