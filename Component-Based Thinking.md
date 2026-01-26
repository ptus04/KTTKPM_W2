# Component-Based Thinking

## Domain Decomposition

Phân chia theo model và nghiệp vụ cốt lõi, tối ưu cho thay đổi chức năng và giao tiếp giữa domain.

```UML
[User Management]
	 |
	 v
[Enrollment] <--> [Course Catalog] <--> [Scheduling/Calendar]
	 |
	 v
[Billing/Payment] --> [Reporting/Analytics]
	 |
	 v
[Notification]
```

## Technical Partitioning

Chia theo tầng kỹ thuật để tái sử dụng hạ tầng và chuẩn hóa giao tiếp.

```UML
                        [UI/Frontend]
	                          |
	                          v
                      [API/Controllers]
	                          |
	                          v
           [A p p l i c a t i o n  S e r v i c e s]
            |                 |                  |
            v                 v                  v
[Domain Services]  [Notification Service]  [Analytics Service]
	    |
	    v
[Infrastructure/Persistence/DB]
```

## So sánh hai cách partition

- Hướng Domain Decomposition tập trung vào nghiệp vụ, dễ giao việc cho team theo domain, backlog rõ ràng, đổi mới tính năng ít ảnh hưởng chéo nhau nếu API giữa domain ổn định.
- Hướng Technical Partitioning tập trung tối ưu vận hành hạ tầng, chia theo tầng kỹ thuật; dễ chuẩn hóa logging, auth, data access, nhưng đội phát triển phải phối hợp nhiều tầng cho mỗi tính năng nên luồng thay đổi dài hơn, khó thay đổi hơn.

## Quyết định kiến trúc mô-đun

Nên chọn **Domain Decomposition** vì phù hợp tổ chức team theo domain, giảm phụ thuộc khi thêm/chỉnh sửa tính năng khóa học, đăng ký, lịch, thanh toán.
