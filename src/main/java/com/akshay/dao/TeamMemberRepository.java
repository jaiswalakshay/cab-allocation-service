package com.akshay.dao;

import com.akshay.domain.TeamMember;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TeamMemberRepository extends PagingAndSortingRepository<TeamMember, Integer> {

    TeamMember findByTeamMemberId(Integer integer);


    TeamMember save(TeamMember teamMember);


}
