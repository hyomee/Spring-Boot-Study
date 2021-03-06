package co.kr.abacus.cube.contract.svc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import co.kr.abacus.cube.contract.common.entity.BaseEntity;
import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;


// 가입자별 서비스 이벤트 관리 
@Entity
@Table(name="TB_SB_SVC_EVNT_BY_ENTR")
@ToString
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(callSuper = true)
public class SbSvcEvntByEntrEntity extends BaseEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ENTR_EVNT_SEQNO")
	private long entrEvntSeqno;
	
	private long entrNo;
	private String svcCd;
	private String custCHnlCd;
	private long entrSvcSeqno;
	private String evntCd;
	private String rqstDt;
	private String evntPrssDt;
	private String prssCd;
	

}
