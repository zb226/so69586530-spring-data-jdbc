package zb226.qa.so69586530.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("outlet_offeredservice")
public class OutletOfferedService {

	@Id
	private String id;

	private String outletId;

	@Override
	public String toString() {
		return "OutletOfferedService [id=" + id + ", outletId=" + outletId + "]";
	}
	
}