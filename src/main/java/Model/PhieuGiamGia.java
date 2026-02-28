package Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Entity
@Table(name = "phieu_giam_gia")
public class PhieuGiamGia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "loai_phieu_id", referencedColumnName = "id")
    private LoaiPhieuGiamGia loaiPhieuGiamGia;

    @Column(name = "ma")
    private String ma;

    @Column(name = "ten")
    private String ten;

    @Column(name = "so_luong")
    private Integer soLuong;

    @Column(name = "loai_giam")
    private String loaiGiam;

    @Column(name = "dieu_kien_toi_thieu")
    private String dieuKienToiThieu;

    @Column(name = "gia_tri_toi_da")
    private String giaTriToiDa;
}
