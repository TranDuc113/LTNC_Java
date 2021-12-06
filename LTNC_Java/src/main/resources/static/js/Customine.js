function MessageBox(Title, Icon) {
    Swal.fire({
        text: Title,
        icon: Icon,
        showConfirmButton: false,
        timer: 5000
    })
}

function ThemGioHang(IdSanPham) 
{
	swal.fire({
        title: '',
        text: 'Chắc chắn mua sản phẩm này?',
        icon: 'question',
        customClass: {
            confirmButton: 'btn btn-primary ml-2 text-center',
            cancelButton: 'btn btn-primary ml-2 text-center'
        },
        buttonsStyling: false,
        showCancelButton: true,
        confirmButtonText: 'Chấp nhận',
        cancelButtonText: 'Không chấp nhận',
        reverseButtons: false,
    })
        .then((result) => {
            if (result.value) {
				$.post("/ThemSanPhamVaoGioHang", { "IdSanPham": IdSanPham }, function (data) {
					MessageBox(data.Title,data.Icon);
					LayDuLieuGioHang();
                });
            }
        })
}

function XemNhanhSanPham(IdSanPham)
{
	$("#LoadXemNhanhSanPham").load("/XemNhanhSanPham",{"IdSanPham": IdSanPham},function(){
		$("#QuickView").modal('show');
	})
}

function GiamSoLuongSanPhamXemNhanh()
{
	var soLuongSanPham=parseInt($("#SoLuongSanPhamXemNhanh").val(), 10);
	if(soLuongSanPham>0){
		$("#SoLuongSanPhamXemNhanh").val(soLuongSanPham-1);
	}
	else
	{
		MessageBox("Số lượng mua không hợp lệ","error");
	}
}

function TangSoLuongSanPhamXemNhanh()
{
	var soLuongSanPham=parseInt($("#SoLuongSanPhamXemNhanh").val(), 10);
	if(soLuongSanPham >= 0){
		$("#SoLuongSanPhamXemNhanh").val(soLuongSanPham+1);
	}
	else
	{
		MessageBox("Số lượng mua không hợp lệ","error");
	}
}

function ThemGioHangXemNhanh(IdSanPham) 
{
	swal.fire({
        title: '',
        text: 'Chắc chắn mua sản phẩm này?',
        icon: 'question',
        customClass: {
            confirmButton: 'btn btn-primary ml-2 text-center',
            cancelButton: 'btn btn-primary ml-2 text-center'
        },
        buttonsStyling: false,
        showCancelButton: true,
        confirmButtonText: 'Chấp nhận',
        cancelButtonText: 'Không chấp nhận',
        reverseButtons: false,
    })
        .then((result) => {
            if (result.value) {
				var SoLuong=parseInt($("#SoLuongSanPhamXemNhanh").val(), 10);
				if(SoLuong>0)
				{
					$.post("/ThemSanPhamVaoGioHang", { "IdSanPham": IdSanPham ,"SoLuong": SoLuong}, function (data) {
						MessageBox(data.Title,data.Icon);
						$("#QuickView").modal('hide');
						LayDuLieuGioHang();
                	});
				}
				else
				{
					MessageBox("Số lượng mua không hợp lệ","error");
				}
            }
        })
}

function XemThemSanPham()
{
	$("#LoadingSanPham").removeClass("AnHienLoad");
	var ViTri=parseInt($("#ValueXemThemSanPham").val());
	var SoLuongSanPham=parseInt($("#SoLuongSanPham").val());
	
	var solamtron=(SoLuongSanPham/8).toFixed()
	if(solamtron < SoLuongSanPham/8)
	{
		solamtron=solamtron+1;
	}
	if(ViTri<=solamtron)
	{
		ViTri=ViTri+1;
		$("#ValueXemThemSanPham").val(ViTri);
		$.get("/XemThemSanPham", {"ViTri":ViTri}, function (data) {
				$("#DanhSach_SanPham").append(data);
				$("#LoadingSanPham").addClass("AnHienLoad");
				if(ViTri=solamtron)
				{
					$("#XemThemSanPham").addClass("AnHienLoad");
				}
			}
		);
	}
	else
	{
		if(ViTri=solamtron)
		{
			$("#XemThemSanPham").addClass("AnHienLoad");
		}
	}
	
}

function DangKyTaiKhoan()
{
	$("#register").modal("show");
	$("#login").modal("hide");
}

function DangNhapTaiKhoan()
{
	$("#login").modal("show");
	$("#register").modal("hide");
}

function LayDuLieuGioHang()
{
	$.post("/ChiTietGioHang", {}, function (data) {
		if(data.Icon=="success"){
			$("#TongGiaGioHang").html(data.TongTien);
			$("#TongTienGioHang").html(data.TongTien);
			$("#SoLuongSanPhamTrongGioHang").html(data.TongSanPham);
			$("#ChiTietGioHang").html(data.DataChiTietGioHang);
		}
	});
}

function DatHang()
{
	var KiemTraHang=$("#TongGiaGioHang").html().trim();
	if(KiemTraHang=='0')
	{
		MessageBox("Giỏ hàng của bạn hiện không có hàng hóa. Xin vui lòng đặt hàng để tiếp tục thanh toán","error");
	}
	else
	{
		$.get("/KiemTraDangNhap", {}, function (data) {
			if(data.Icon=="success"){
				location.href="/TienHanhThanhToan";
			}
			else
			{
				MessageBox(data.Title,data.Icon);
				$("#login").modal("show");
			}
		});
		
	}
}

function ChonHinhThucThanhToan(IdHinhThuc)
{
	$(".hinthucthanhtoan").removeClass("active");
	$(".hinthucthanhtoan"+IdHinhThuc).addClass("active");
	return false;
}

function XoaSanPham(IdSanPham)
{
	swal.fire({
        title: '',
        text: 'Chắc chắn xóa sản phẩm này?',
        icon: 'question',
        customClass: {
            confirmButton: 'btn btn-primary ml-2 text-center',
            cancelButton: 'btn btn-primary ml-2 text-center'
        },
        buttonsStyling: false,
        showCancelButton: true,
        confirmButtonText: 'Chấp nhận',
        cancelButtonText: 'Không chấp nhận',
        reverseButtons: false,
    })
        .then((result) => {
            if (result.value) {
				$.post("/XoaSanPhamTrongGioHang", { "IdSanPham": IdSanPham}, function (data) {
						MessageBox(data.Title,data.Icon);
						layLaiThongTinGioHang();
						LayDuLieuGioHang();
                });
            }
        })
}

function layLaiThongTinGioHang()
{
	$.get("/ChiTietGioHang", {}, function (data) {
		if(data.Icon=="success"){
			$("#GioHangChiTiet").html(data.Data);
		}
	});
}

function GiamSoLuong(IdSanPham)
{
	var soLuongSanPham=parseInt($("#SoLuong"+IdSanPham).val(), 10);
	if(soLuongSanPham>0){
		$("#SoLuong"+IdSanPham).val(soLuongSanPham-1);
		$.post("/CapNhatSanPhamTrongGioHang", { "IdSanPham": IdSanPham,"soLuongSanPham":soLuongSanPham-1}, function (data) {
			LayDuLieuGioHang();
        });
	}
	else
	{
		MessageBox("Số lượng mua không hợp lệ","error");
	}
}

function TangSoLuong(IdSanPham)
{
	var soLuongSanPham=parseInt($("#SoLuong"+IdSanPham).val(), 10);
	if(soLuongSanPham >= 0){
		$("#SoLuong"+IdSanPham).val(soLuongSanPham+1);
		$.post("/CapNhatSanPhamTrongGioHang", { "IdSanPham": IdSanPham,"soLuongSanPham":soLuongSanPham+1}, function (data) {
        	LayDuLieuGioHang();
		});
	}
	else
	{
		MessageBox("Số lượng mua không hợp lệ","error");
	}
}

function ThanhThoanThanhCong()
{
	swal.fire({
        title: '',
        text: 'Chắc chắn thanh toán?',
        icon: 'question',
        customClass: {
            confirmButton: 'btn btn-primary ml-2 text-center',
            cancelButton: 'btn btn-primary ml-2 text-center'
        },
        buttonsStyling: false,
        showCancelButton: true,
        confirmButtonText: 'Chấp nhận',
        cancelButtonText: 'Không chấp nhận',
        reverseButtons: false,
    })
        .then((result) => {
			 if (result.value) {
				 location.href="/ThanhThoanThanhCong";
            }
        })
}

function XoaSanPhamChiTietGioHang(IdSanPham)
{
	swal.fire({
        title: '',
        text: 'Chắc chắn xóa sản phẩm này?',
        icon: 'question',
        customClass: {
            confirmButton: 'btn btn-primary ml-2 text-center',
            cancelButton: 'btn btn-primary ml-2 text-center'
        },
        buttonsStyling: false,
        showCancelButton: true,
        confirmButtonText: 'Chấp nhận',
        cancelButtonText: 'Không chấp nhận',
        reverseButtons: false,
    })
        .then((result) => {
            if (result.value) {
				$.post("/XoaSanPhamTrongGioHang", { "IdSanPham": IdSanPham}, function (data) {
						MessageBox(data.Title,data.Icon);
						LayDuLieuGioHang();
                });
            }
        })
}

function TangSanPhamGioHang(IdSanPham)
{
	var soLuongSanPham=parseInt($("#SanPhamGioHang"+IdSanPham).val(), 10);
	if(soLuongSanPham >= 0){
		$("#SanPhamGioHang"+IdSanPham).val(soLuongSanPham+1);
		$.post("/CapNhatSanPhamTrongGioHang", { "IdSanPham": IdSanPham,"soLuongSanPham":soLuongSanPham+1}, function (data) {
        	LayDuLieuGioHang();
		});
	}
	else
	{
		MessageBox("Số lượng mua không hợp lệ","error");
	}
}

function GiamSanPhamGioHang(IdSanPham)
{
	var soLuongSanPham=parseInt($("#SanPhamGioHang"+IdSanPham).val(), 10);
	if(soLuongSanPham>0){
		$("#SanPhamGioHang"+IdSanPham).val(soLuongSanPham-1);
		$.post("/CapNhatSanPhamTrongGioHang", { "IdSanPham": IdSanPham,"soLuongSanPham":soLuongSanPham-1}, function (data) {
			LayDuLieuGioHang();
        });
	}
	else
	{
		MessageBox("Số lượng mua không hợp lệ","error");
	}
}