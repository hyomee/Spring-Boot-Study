package co.kr.abacus.cube.order.rqst.svc.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SvcByEntrRqstSvcGrpValue {
	
	// 상품할인 그룹 번호 
	@Column(name="SVC_GRP_SEQNO")
	private long svcGrpSeqno;
	
	// 상품할인 그룹 코드 
	@Column(name="SVC_GRP_CD")
	private long svcGrpCd;
	
	

}
